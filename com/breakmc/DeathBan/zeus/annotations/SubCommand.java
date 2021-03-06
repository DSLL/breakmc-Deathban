package com.breakmc.DeathBan.zeus.annotations;

import java.lang.annotation.*;
import javax.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface SubCommand {
    @Nonnull
    String parent();
    
    @Nonnull
    String name();
    
    String[] aliases() default {};
    
    String permission() default "";
}
