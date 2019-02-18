package com.spacewhales.EbucketList;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * this is the login request from user class added as a helper to the tests so that it doesn't need to
 * have hardcoded login token
 */
public class LoginRequest {
    @JsonProperty("username")
    private String username = null;

    @JsonProperty("password")
    private String password = null;

    public LoginRequest username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get username
     * @return username
     **/
    @ApiModelProperty(value = "")


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LoginRequest password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Password hashed by client
     * @return password
     **/
    @ApiModelProperty(value = "Password hashed by client")


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginRequest loginRequest = (LoginRequest) o;
        return Objects.equals(this.username, loginRequest.username) &&
                Objects.equals(this.password, loginRequest.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginRequest {\n");

        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
