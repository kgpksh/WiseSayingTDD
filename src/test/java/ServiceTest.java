import org.example.Service;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
class ServiceTest {
    @Test
    @DisplayName("등록시 생성된 명언번호 노출")
    public void t1() {

        assertThat(AppTestRunner.run("등록 \n 현재를 사랑하라 \n 작자미상"))
                .contains("1번 명언이 등록되었습니다.");
    }
}