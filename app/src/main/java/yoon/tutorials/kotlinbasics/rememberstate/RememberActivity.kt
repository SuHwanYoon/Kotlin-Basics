package yoon.tutorials.kotlinbasics.rememberstate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import yoon.tutorials.kotlinbasics.rememberstate.ui.theme.KotlinBasicsTheme
import kotlin.random.Random

class RememberActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //컴포저블 함수 선언
                    CaptainGame()
                }
            }
        }
    }

    @Composable
    fun CaptainGame() {
        //remember로 compose상태를 저장, muatbleStateOf로 상태를 관찰하여 컴포저블 함수 재구성
        //val treasuresFound = remember { mutableStateOf(0) }
        //by keyword를 사용해서 직접 접근가능 변수값 변경을 위해서 var사용
        var treasuresFound by remember { mutableIntStateOf(0) }
        //초기 direction text 는 North
        val direction = remember { mutableStateOf("North") }
        //초기 변수값은 empty String
        val stormOrTreasure = remember { mutableStateOf("") }
        Column {
            //remember 변수값에 접근하는 텍스트
//            Text(text = "Treasures Found: ${treasuresFound.value}")
            //by keyword가 있기때문에 직접접근가능 {} 삭제가능
            Text(text = "Treasures Found: $treasuresFound")
            Text(text = "Current Direction: ${direction.value}")
            //stormOrTreasure를 만났을때 나타나는 text
            Text(text = "${stormOrTreasure.value}")
            //동쪽 버튼
            Button(onClick = {
                //버튼 클릭시 direction값을 변경
                direction.value = "East"
                //버튼 클릭시 50%의 확률로 true가 나오면
                if (Random.nextBoolean()) {
                    //treasuresFound값이 증가 + text표시
                    treasuresFound++
                    stormOrTreasure.value = "We found a treasure!"
                } else {
                    //kotlin은 Ternary Operation을 사용하지 않음
                    //treasure를 못찾았을 경우 text
                    stormOrTreasure.value = "It's a storm! Be careful!"
                }
            }) {
                Text(text = "Change to East")
            }
            //서쪽 버튼
            Button(onClick = {
                //버튼 클릭시 direction값을 변경
                direction.value = "West"
                //버튼 클릭시 50%의 확률로 true가 나오면
                if (Random.nextBoolean()) {
                    //treasuresFound값이 증가 + text표시
                    treasuresFound++
                    stormOrTreasure.value = "We found a treasure!"
                } else {
                    //kotlin은 Ternary Operation을 사용하지 않음
                    //treasure를 못찾았을 경우 text
                    stormOrTreasure.value = "It's a storm! Be careful!"
                }
            }) {
                Text(text = "Change to West")
            }
            //북쪽 버튼
            Button(onClick = {
                //버튼 클릭시 direction값을 변경
                direction.value = "North"
                //버튼 클릭시 50%의 확률로 true가 나오면
                if (Random.nextBoolean()) {
                    //treasuresFound값이 증가 + text표시
                    treasuresFound++
                    stormOrTreasure.value = "We found a treasure!"
                } else {
                    //kotlin은 Ternary Operation을 사용하지 않음
                    //treasure를 못찾았을 경우 text
                    stormOrTreasure.value = "It's a storm! Be careful!"
                }
            }) {
                Text(text = "Change to North")
            }
            //남쪽 버튼
            Button(onClick = {
                //버튼 클릭시 direction값을 변경
                direction.value = "South"
                //버튼 클릭시 50%의 확률로 true가 나오면
                if (Random.nextBoolean()) {
                    //treasuresFound값이 증가 + text표시
                    treasuresFound++
                    stormOrTreasure.value = "We found a treasure!"
                } else {
                    //kotlin은 Ternary Operation을 사용하지 않음
                    //treasure를 못찾았을 경우 text
                    stormOrTreasure.value = "It's a storm! Be careful!"
                }
            }) {
                Text(text = "Change to South")
            }
        }
    }
}

