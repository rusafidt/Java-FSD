enum Weekday {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}


function test(weekday: Weekday) {
    console.log(weekday);
}

test(Weekday.Sunday);
test(Weekday.Monday);