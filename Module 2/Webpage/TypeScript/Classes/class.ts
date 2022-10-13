class car {
    engine: string;


    constructor(engine: string) {
        this.engine = engine;
    }

    disp(): void {
        console.log("Function displays Engine is : " + this.engine);
    }
}

var obj = new car("XXSY1");
obj.disp();

console.log("Reading attribute value Engine as : " + obj.engine);