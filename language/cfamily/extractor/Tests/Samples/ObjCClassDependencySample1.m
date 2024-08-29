@interface A : NSObject {
    float height;
}
@end

@implementation A : NSObject {
}
- (void)sayHello {
    //NSLog(@"Hello World A!");
}
@end

@interface B : NSObject {
}
@end

@implementation B
- (void)sayHello {
    A *a = [[A alloc] init];
    //NSLog(@"Hello World B!");
}

- (void)acceptWithA:(A*)paramA Second:(int)i {
    [paramA sayHello];
}
@end

int main () {
    B *b = [[B alloc] init];

    [b sayHello];
    return 0;
}