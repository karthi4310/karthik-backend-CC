package com.farmer.Form.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
 
@Data
public class ForgotUserIdDTO {
 
    @NotBlank(message = "Email or Phone number is required")
    private String emailOrPhone;
}
