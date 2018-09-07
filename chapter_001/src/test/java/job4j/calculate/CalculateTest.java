package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест класса Calculate
 * @author Mikhail Ismuratov
 * @since 05.09.2018
 * @version 1.0
 */






	public class CalculateTest {
		/**
		* Test echo.
		*/
		@Test
		public void whenTakeNameThenTreeEchoPlusName() {
			String input = "Mikhail";
			String expect = "Echo, echo, echo : Mikhail";
			//Создание нового объекта.
			Calculate calc = new Calculate();
			//Выполнение метода echo с параметром input и запись ее в переменную result.
			String result = calc.echo(input); 
			//Сравнение result и expect. 
			assertThat(result, is(expect));

		}
	}