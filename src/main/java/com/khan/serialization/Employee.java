package com.khan.serialization;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Employee implements Serializable {
	private static final long serialVersionUID = -4277201884616196206L;
	private String id;
	private String name;
}
