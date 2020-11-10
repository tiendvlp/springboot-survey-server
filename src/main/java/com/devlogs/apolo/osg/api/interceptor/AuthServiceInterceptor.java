package com.devlogs.apolo.osg.api.interceptor;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.regex.Pattern;

@Component
public class AuthServiceInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        NetHttpTransport transport = new NetHttpTransport();
        JsonFactory jsonFactory = new GsonFactory();
        GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(transport, jsonFactory)
                .setAudience(Collections.singletonList("779260072081-g9ht0cn5jn8abkq76jl8p763njoe1ucl.apps.googleusercontent.com"))
                .build();
        GoogleIdToken idToken = null;
        String idTokenString = request.getHeader("Authorization").split(" ")[1];
        idToken = verifier.verify(idTokenString);

        if (idToken != null) {
            GoogleIdToken.Payload payload = idToken.getPayload();

            //region get attribute
            String email = payload.getEmail();
            String name = (String) payload.get("name");
            String pictureUrl = (String) payload.get("picture");
            String moreUserInfo = getStringInParenthese(name);
            String campus = moreUserInfo.split(" ")[1];
            int admisson = Integer.parseInt(moreUserInfo.split(" ")[0].replaceFirst("K", ""));
            String studentId = getStudentId(email);
            //endregion

            if (!checkEmail(email)) {
                authFailedRespond(response);
                return false;
            }

            request.setAttribute("userEmail", email);
            request.setAttribute("userName", name);
            request.setAttribute("pictureUrl", pictureUrl);
            request.setAttribute("campus", campus);
            request.setAttribute("admission", admisson);
            request.setAttribute("studentId", studentId);
            return true;
        } else {
            System.out.println("Invalid ID token.");
            authFailedRespond(response);
            return false;
        }
    }

    private void authFailedRespond (HttpServletResponse response) throws IOException {
        response.getWriter().write("UNAUTHORIZED: token is invalid or email is not belong to FPT University");
        response.setStatus(401);
    }

    // email have to be something@fpt.edu.vn
    private boolean checkEmail (String email) {
        String fptEmailRegex = "^[a-z0-9](\\.?[a-z0-9]){5,}@fpt.edu.vn$";
        Pattern pattern = Pattern.compile(fptEmailRegex);
        return Pattern.matches(fptEmailRegex, email);
    }

    private String getStudentId (String studentEmail) {
        int studentCodeLength = 8;
        int codeLastIndex = studentEmail.indexOf("@fpt.edu.vn");
        String studentId = studentEmail.substring(codeLastIndex - studentCodeLength, codeLastIndex);
        return studentId;
    }


    private String getStringInParenthese (String string) {
        String result = "";

        boolean start = false;
        for (char c : string.toCharArray()) {
            if (c == '(') {
                start = true;
                continue;
            } else if (c == ')') {
                start = false;
            }

            if (start) {
                result += c;
            }
        }
        System.out.println("dume: " + result);
        return result;
    }
}

















































