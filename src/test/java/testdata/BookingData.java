package testdata;

public record BookingData(String firstname, String lastname, int totalprice, boolean depositpaid,
                          BookingDates bookingdates, String additionalneeds) { }