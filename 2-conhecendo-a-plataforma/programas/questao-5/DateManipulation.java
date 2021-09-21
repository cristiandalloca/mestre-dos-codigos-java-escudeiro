import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;

public class DateManipulation {
    public static void main(String[] args) {
        
        // LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Demonstracao LocalDate: " + localDate);

        System.out.println("Extraindo informações do dia atual...");
        System.out.println("Dia: " + localDate.getDayOfMonth());
        System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
        System.out.println();

        System.out.println("Extraindo informações do mes atual...");
        System.out.println("Mes: " + localDate.getMonthValue());
        System.out.println("Mes descricao: " + localDate.getMonth().name());
        System.out.println();

        System.out.println("Extraindo informações do ano atual...");
        System.out.println("Ano: " + localDate.getYear());
        System.out.println();

        System.out.println("Comparacao entre datas...");
        LocalDate localDateToCompare = LocalDate.of(2021, 12, 30);
        System.out.println("Data a ser comparada: " + localDateToCompare);
        System.out.println("[" + localDate + "] isAfter [" + localDateToCompare + "] = " + localDate.isAfter(localDateToCompare));
        System.out.println("[" + localDate + "] isBefore [" + localDateToCompare + "] = " + localDate.isBefore(localDateToCompare));
        System.out.println("[" + localDate + "] isEqual [" + localDateToCompare + "] = " + localDate.isEqual(localDateToCompare));
        System.out.println();

        System.out.println("Manipulação LocalDate [ " + localDate + " ]...");
        System.out.println("Mais 2 dias: " + localDate.plusDays(2));
        System.out.println("Mais 4 meses: " + localDate.plusMonths(4));
        System.out.println("Mais 5 anos: " + localDate.plusYears(5));
        System.out.println("Menos 2 dias: " + localDate.minusDays(2));
        System.out.println("Menos 4 meses: " + localDate.minusMonths(4));
        System.out.println("Menos 5 anos: " + localDate.minusYears(5));
        System.out.println();

        System.out.println("Convertendo String p/ LocalDate...");
        System.out.println(LocalDate.parse("2021-09-18"));
        System.out.println("Convertendo LocalDate p/ LocalDateTime...");
        System.out.println(localDate.atStartOfDay());
        System.out.println("Convertendo LocalDate p/ MonthDay...");
        System.out.println(MonthDay.from(localDate));
        System.out.println("Convertendo LocalDate p/ YearMonth...");
        System.out.println(YearMonth.from(localDate));
        
        // LocalTime
        System.out.println("-------------------------");
        LocalTime localTime = LocalTime.now();
        System.out.println("Demonstracao LocalTime: " + localTime);

        System.out.println("Extraindo informações da hora atual...");
        System.out.println("Hora: " + localTime.getHour());
        System.out.println();

        System.out.println("Extraindo informações do minuto atual...");
        System.out.println("Minuto: " + localTime.getMinute());
        System.out.println();

        System.out.println("Extraindo informações do segundo atual...");
        System.out.println("Segundos: " + localTime.getSecond());

        System.out.println("Comparacao entre horas...");
        LocalTime localTimeToCompare = LocalTime.of(15, 7, 59);
        System.out.println("Hora a ser comparada: " + localTimeToCompare);
        System.out.println("[" + localTime + "] isAfter [" + localTimeToCompare + "] = " + localTime.isAfter(localTimeToCompare));
        System.out.println("[" + localTime + "] isBefore [" + localTimeToCompare + "] = " + localTime.isBefore(localTimeToCompare));
        System.out.println("[" + localTime + "] equals [" + localTimeToCompare + "] = " + localTime.equals(localTimeToCompare));
        System.out.println();

        System.out.println("Manipulação LocalTime [ " + localTime + " ]...");
        System.out.println("Mais 2 horas: " + localTime.plusHours(2));
        System.out.println("Mais 4 minutos: " + localTime.plusMinutes(4));
        System.out.println("Mais 5 segundos: " + localTime.plusSeconds(5));
        System.out.println("Menos 2 horas: " + localTime.minusHours(2));
        System.out.println("Menos 50 minutos: " + localTime.minusMinutes(50));
        System.out.println("Menos 120 segundos: " + localTime.minusSeconds(120));
        System.out.println();

        System.out.println("Convertendo String p/ LocalTime...");
        System.out.println(LocalTime.parse("15:30:08"));


        // LocalDateTime
        System.out.println("-------------------------");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Demonstracao LocalDateTime: " + localDateTime);

        System.out.println("Extraindo informações do dia atual...");
        System.out.println("Dia: " + localDateTime.getDayOfMonth());
        System.out.println("Dia da semana: " + localDateTime.getDayOfWeek().name());
        System.out.println();

        System.out.println("Extraindo informações do mes atual...");
        System.out.println("Mes: " + localDateTime.getMonthValue());
        System.out.println("Mes descricao: " + localDateTime.getMonth().name());
        System.out.println();

        System.out.println("Extraindo informações do ano atual...");
        System.out.println("Ano: " + localDateTime.getYear());
        System.out.println();

        System.out.println("Extraindo informações da hora atual...");
        System.out.println("Hora: " + localDateTime.getHour());
        System.out.println();

        System.out.println("Extraindo informações do minuto atual...");
        System.out.println("Minuto: " + localDateTime.getMinute());
        System.out.println();

        System.out.println("Extraindo informações do segundo atual...");
        System.out.println("Segundos: " + localDateTime.getSecond());

        System.out.println("Comparacao entre datas e hora...");
        LocalDateTime localDateTimeToCompare = LocalDateTime.of(LocalDate.of(2021, 12, 30), LocalTime.of(15, 7, 59));
        System.out.println("Data a ser comparada: " + localDateTimeToCompare);
        System.out.println("[" + localDateTime + "] isAfter [" + localDateTimeToCompare + "] = " + localDateTime.isAfter(localDateTimeToCompare));
        System.out.println("[" + localDateTime + "] isBefore [" + localDateTimeToCompare + "] = " + localDateTime.isBefore(localDateTimeToCompare));
        System.out.println("[" + localDateTime + "] isEqual [" + localDateTimeToCompare + "] = " + localDateTime.isEqual(localDateTimeToCompare));
        System.out.println();
        
        System.out.println("Manipulação LocalDateTime [ " + localDateTime + " ]...");
        System.out.println("Mais 2 horas: " + localDateTime.plusHours(2));
        System.out.println("Mais 4 minutos: " + localDateTime.plusMinutes(4));
        System.out.println("Mais 5 segundos: " + localDateTime.plusSeconds(5));
        System.out.println("Menos 2 horas: " + localDateTime.minusHours(2));
        System.out.println("Menos 50 minutos: " + localDateTime.minusMinutes(50));
        System.out.println("Menos 120 segundos: " + localDateTime.minusSeconds(120));
        System.out.println("Mais 2 dias: " + localDateTime.plusDays(2));
        System.out.println("Mais 4 meses: " + localDateTime.plusMonths(4));
        System.out.println("Mais 5 anos: " + localDateTime.plusYears(5));
        System.out.println("Menos 2 dias: " + localDateTime.minusDays(2));
        System.out.println("Menos 4 meses: " + localDateTime.minusMonths(4));
        System.out.println("Menos 5 anos: " + localDateTime.minusYears(5));
        System.out.println();

        System.out.println("Convertendo String p/ LocalDateTime...");
        System.out.println(LocalDateTime.parse("2021-09-18T10:40:57"));
        System.out.println("Convertendo LocalDateTime p/ LocalDate...");
        System.out.println(LocalDate.from(localDateTime));
        System.out.println("Convertendo LocalDateTime p/ LocalTime...");
        System.out.println(LocalTime.from(localDateTime));
        System.out.println("Convertendo LocalDateTime p/ YearMonth...");
        System.out.println(YearMonth.from(localDateTime));
        System.out.println("Convertendo LocalDateTime p/ MonthDay...");
        System.out.println(MonthDay.from(localDateTime));

        // MonthDay
        System.out.println("-------------------------");
        MonthDay monthDay = MonthDay.now();
        System.out.println("Demonstracao MonthDay: " + monthDay.toString());

        System.out.println("Extraindo informações do mes atual...");
        System.out.println("Mes: " + monthDay.getMonthValue());
        System.out.println();

        System.out.println("Extraindo informações do dia atual...");
        System.out.println("Dia: " + monthDay.getDayOfMonth());
        System.out.println();

        System.out.println("Extraindo nome do mes atual...");
        System.out.println("Mes: " + monthDay.getMonth().name());
        System.out.println();

        System.out.println("Comparacao entre meses...");
        MonthDay monthDayToCompare = MonthDay.of(Month.FEBRUARY, 6);
        System.out.println("Dia/Mês a ser comparado: " + monthDayToCompare.toString());
        System.out.println("[" + monthDay.toString() + "] isAfter [" + monthDayToCompare + "] = " + monthDay.isAfter(monthDayToCompare));
        System.out.println("[" + monthDay.toString() + "] isBefore [" + monthDayToCompare + "] = " + monthDay.isBefore(monthDayToCompare));
        System.out.println("[" + monthDay.toString() + "] equals [" + monthDayToCompare + "] = " + monthDay.equals(monthDayToCompare));
        System.out.println();


        // YearMonth
        System.out.println("-------------------------");
        YearMonth yearMonth = YearMonth.now();
        System.out.println("Demonstracao YearMonth: " + yearMonth.toString());

        System.out.println("Extraindo informações do mes atual...");
        System.out.println("Mes: " + yearMonth.getMonthValue());
        System.out.println();

        System.out.println("Extraindo nome do mes atual...");
        System.out.println("Mes: " + yearMonth.getMonth().name());
        System.out.println();

        System.out.println("Extraindo informações do ano atual...");
        System.out.println("Ano: " + yearMonth.getYear());
        System.out.println();

        System.out.println("Comparacao entre anos...");
        YearMonth yearMonthToCompare = YearMonth.of(1997, Month.FEBRUARY);
        System.out.println("Ano/Mes a ser comparado: " + yearMonthToCompare.toString());
        System.out.println("[" + yearMonth.toString() + "] isAfter [" + yearMonthToCompare + "] = " + yearMonth.isAfter(yearMonthToCompare));
        System.out.println("[" + yearMonth.toString() + "] isBefore [" + yearMonthToCompare + "] = " + yearMonth.isBefore(yearMonthToCompare));
        System.out.println("[" + yearMonth.toString() + "] equals [" + yearMonthToCompare + "] = " + yearMonth.equals(yearMonthToCompare));
        System.out.println();


        // Period
        System.out.println("-------------------------");
        LocalDate localDateToCalculatePeriod = LocalDate.of(1997, 2, 6);
        Period period = Period.between(localDateToCalculatePeriod, localDate);
        System.out.println("Utilizando a classe Period, entre [" + localDateToCalculatePeriod + "] e [" + localDate + "]");
        System.out.println("Periodo em dias: " + period.getDays());
        System.out.println("Periodo em meses dentro do ano: " + period.getMonths());
        System.out.println("Periodo em anos: " + period.getYears());
        System.out.println("Meses totais: " + period.toTotalMonths());
        System.out.println();
    }
}
