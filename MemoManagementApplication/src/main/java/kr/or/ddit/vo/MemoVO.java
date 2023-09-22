package kr.or.ddit.vo;

import java.io.Serializable;
import java.time.LocalDate;

import org.apache.commons.lang3.builder.ToStringExclude;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(of = "code")
@ToString
public class MemoVO implements Serializable{
	private int code;
	private String writer;
	@JsonIgnore
	@ToStringExclude
	private String email;
	private LocalDate wrdate;
	private String content;
}
