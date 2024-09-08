package com.example.postingapp.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class SignupForm {
	
	@NotBlank(message = "ユーザー名を入力して下さい。")
	private String name;
	
	@NotBlank(message = "メールアドレスを入力して下さい。")
	@Email(message = "メールアドレスは正しい形で入力して下さい。")
	private String email;
	
	@NotBlank(message = "パスワードを入力して下さい。")
	@Length(min = 8, message = "パスワードは8文字以上で入力して下さい。")
	private String password;
	
	@NotBlank(message = "パスワード（確認用）を入力してください。")
	private String passwordConfirmation;
}
