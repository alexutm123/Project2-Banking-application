package com.example.SpringTest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Создать приложение, которое будет создавать Account с параметрами пользователя
 * и счетом Bill
 *
 * Account будет содержать следующие поля: accountId, name, email,dolg, список Bill
 *
 * Bill будет содержать следующие поля: billId, BigDecimal amount, boolean isDefault,repaymentOfADebt
 *
 * Так же нужно будет уметь принимать платежи Payment и изменения процента долга
 *
 * И реализовать метод перевода денег с одного Account на другой (Transfer) в отдельном контроллере
 */

@SpringBootApplication
public class SpringTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringTest2Application.class, args);
	}

}
