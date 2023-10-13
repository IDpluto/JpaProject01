package com.ict01.jpaproject01;

public class ResourceNotFoundExeption extends Exception {

  public static final long serialVersionUID = 1L; // 직렬화 버전 ID

  // 생성자
  public ResourceNotFoundExeption(Object resourceId){
    super(resourceId != null ? resourceId.toString() : null); // 예외 메시지 설정
  }
}
