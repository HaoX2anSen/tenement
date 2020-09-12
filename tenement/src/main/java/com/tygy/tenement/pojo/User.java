package com.tygy.tenement.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3553126860175993251L;
	private Integer id;
	private String userName;
	private String userPassword;
	private String userNewPassword;
	private String userPhone;
	private String userCity;
	private String userBlock;
	private String userArea;
	private String userAddress;
	@JsonFormat(pattern = "yy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Timestamp userRegisterDate;
}
