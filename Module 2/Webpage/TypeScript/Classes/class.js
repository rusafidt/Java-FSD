var car = /** @class */ (function () {
    function car(engine) {
        this.engine = engine;
    }
    car.prototype.disp = function () {
        console.log("Function displays Engine is : " + this.engine);
    };
    return car;
}());
var obj = new car("XXSY1");
obj.disp();
console.log("Reading attribute value Engine as : " + obj.engine);
