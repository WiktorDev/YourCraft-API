# YourCraft-API (Java)
## Example
```java
package package;

import java.io.IOException;
import ga.wiktor.dev.ycapi.API;

public class Example {
    public static void main(String[] args) throws IOException {
        API api = new API();
        System.out.println(api.getBlockbreak("nick"));
    }
}
```
##
```java
api.getTime("nick");

api.getDeath("nick");

api.getDistance("nick");

api.getBrokenfarm("nick");

api.getBlockbreak("nick");

api.getItemshop("nick");
```
