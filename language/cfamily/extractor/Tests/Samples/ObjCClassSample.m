#import <Foundation/Foundation.h>

// Forward declaration
@class ForwardDeclarationClass;
@protocol ForwardDeclarationProtocol;

@protocol ForwardDeclarationProtocol
@end

@protocol MyProtocol1
@end

@protocol MyProtocol2 <MyProtocol1>
@end

@protocol MyProtocol3
@end

@interface Person <MyProtocol1>
@property NSInteger intNumber;
- (void)sayHello;
@end

@interface Employee : Person <MyProtocol2, MyProtocol3>
- (void)sayHello;
@end

@implementation Person

- (void)sayHello {
    NSLog(@"Hello, World!");
}

@end

@implementation Employee

- (void)sayHello {
    NSLog(@"Hello, World!");
}

@end

@interface Employee(Quit)

- (void)sayBye:(int)employeeNumber;

@end

@implementation Employee(Quit)

- (void)sayBye:(int)employeeNumber {
    NSLog(@"Bye %d!", employeeNumber);
}

@end

int main()
{
    Person *sample = [[Person alloc] init];
    [sample sayHello];
    sample.intNumber = 10086;
    NSLog(@"%d", sample.intNumber);

    Employee *e = [[Employee alloc] init];
    [e sayHello];
    [e sayBye:10086];

    int a;
    a = 100;

    return 0;
}