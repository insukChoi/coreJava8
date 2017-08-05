package ch1.exercise;

/**
 * JDK에는 자바 라이브러리의 소스 코드가 담긴 src.zip 파일이 포함되어 있다.
 * 이 파일의 압축을 해제한 후 평소에 사용하는 텍스트 검색 도구로 레이블이 붙은 break와 continue의 사용 예를 찾아라.
 * 그 중 하나를 선별해서 레이블을 붙이지 않은 문장으로 재작성하라.
 */
public class ex12 {

    public ex12(){}

/*    public Object before(){
        scan: {
            for (firstUpper = 0 ; firstUpper < len; ) {
                char c = value[firstUpper];
                if ((c >= Character.MIN_HIGH_SURROGATE)
                        && (c <= Character.MAX_HIGH_SURROGATE)) {
                    int supplChar = codePointAt(firstUpper);
                    if (supplChar != Character.toLowerCase(supplChar)) {
                        break scan;
                    }
                    firstUpper += Character.charCount(supplChar);
                } else {
                    if (c != Character.toLowerCase(c)) {
                        break scan;
                    }
                    firstUpper++;
                }
            }
            return this;
        }
    }*/

    // 만약 2중 for문이라면
    // flag 값을 break 문 앞에 둿서
    // break로 첫번째 for문을 빠져나가고 flag를 확인해서
    // 두번째 for문도 break 하는 방법.

}
