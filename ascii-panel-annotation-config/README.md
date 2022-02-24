# 基于 annotation 的配置

将 `AsciiFont` 和 `AsciiPanel` 使用 `@Component` 注解标记，使用 `@Value` 注解提供构造函数所需的其他参数，使用 `@Autowired` 定义组件间的依赖关系

可改变 `value.properties` 中的相关值改变字体和窗体尺寸等参数