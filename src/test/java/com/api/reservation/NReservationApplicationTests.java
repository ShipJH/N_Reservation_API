package com.api.reservation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.api.reservation.model.common.MsgEnum;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NReservationApplicationTests {

	@Test
	public void contextLoads() {
		
		String msg = MsgEnum.getMsg(200);
		
		assertEquals(msg, "success");
	}

}
