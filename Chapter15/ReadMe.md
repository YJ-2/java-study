# CH15 자바 입출력

## 스트림
- 네트웍에서 자료의 흐름이 물과 같다는 의미에서 유래
- 다양한 입출력 장치에 독립적으로 일관성 있는 입출력을 제공하는 방식
- 입출력이 구현되는 곳
    - 파일디스크, 키보드, 마우스, 메모리 네트웍 등

## 스트림의 구분
- 대상 기준
    - 입력 스트림
    - 출력 스트림
- 자료의 종류
    - 바이트 스트림
    - 문자 스트림
- 기능
    - 기반 스트림
    - 보조 스트림

## 입력 스트림과 출력 스트림
- 입력 스트림
    - 대상으로 부터 자료를 읽어 들이는 스트림
- 출력 스트림
    - 대상으로 자료를 출력하는 스트림

## 기반 스트림과 보조 스트림
- 기반 스트림
    - 대상에 직접 자료를 읽고 쓰는 기능의 스트림
- 보조 스트림
    - 직접 읽고 쓰는 기능은 없이 추가적인 기능을 더해주는 스트림
- 보조 스트림은 직접 읽고 쓰는 기능은 없으므로 향상 기반 스트림이나 또 다른 보조 스트림을 생성자 매개변수로 포함함
