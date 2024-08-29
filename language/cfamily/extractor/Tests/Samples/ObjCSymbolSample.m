#import <Foundation/Foundation.h>

// Forward declaration
@class ForwardDeclarationClass;
@protocol ForwardDeclarationProtocol;

@protocol MyProtocol1
@end

@protocol MyProtocol2 <MyProtocol1>
@end

@protocol MyProtocol3
@end

@interface Person : NSObject <MyProtocol1>
@property NSInteger intNumber;
- (void)sayHello;
@end

@interface Employee : Person <MyProtocol2, MyProtocol3>
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

@end

@implementation Employee(Quit)

- (void)sayBye {
    NSLog(@"Bye!");
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
    [e sayBye];

    return 0;
}