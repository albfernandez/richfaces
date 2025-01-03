#!/usr/bin/env bash

FILES=$(cat <<-END
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/html/MenuItemRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/html/MenuItemRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/html/DropDownMenuRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/html/DropDownMenuRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/InplaceSelectRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/InplaceSelectRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/InplaceInputRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/InplaceInputRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/InplaceInputRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/AutocompleteRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/AutocompleteRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/renderkit/AutocompleteRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/javascript/client/validator/ValidatorTestBase.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/javascript/client/validator/BeanValidatorTestBase.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/javascript/client/message/SendMessageTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/javascript/client/message/ClearMessageTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/javascript/client/converter/ConverterTestBase.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/component/GraphValidationTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/component/GraphValidationTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/component/GraphValidationTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/component/ClientValidationTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/component/ClientValidationTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/component/CalendarRenderTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/component/CalendarRenderTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/component/CalendarRenderTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/component/CalendarRenderTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/component/AjaxValidationTest.java
/home/milo/workspace/richfaces-jakarta/components/rich/src/test/java/org/richfaces/component/AjaxValidationTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/MediaOutputRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/MediaOutputRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/HtmlCommandLinkRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/HtmlCommandLinkRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/HtmlCommandLinkRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxStatusRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxStatusRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxPushRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxPushRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxPushRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxPushRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxPageRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxPageRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxOutputPanelRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxOutputPanelRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxOutputPanelRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxIncludeRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxIncludeRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxIncludeRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxFormRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxFormRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/renderkit/html/AjaxFormRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/UIAjaxFormTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/QueueRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/QueueRendererTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/QueueDiscoveryTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/LoadResourceComponentTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/LoadResourceComponentTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/LoadResourceComponentTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/LoadBundleComponentTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/AbstractQueueComponentTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/AbstractQueueComponentTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/AbstractQueueComponentTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/AbstractQueueComponentTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/AbstractQueueComponentTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/AbstractQueueComponentTest.java
/home/milo/workspace/richfaces-jakarta/components/a4j/src/test-old/java/org/ajax4jsf/component/AbstractQueueComponentTest.java
/home/milo/workspace/richfaces-jakarta/build/build-resources/src/main/java/org/richfaces/arquillian/page/source/SourceChecker.java
/home/milo/workspace/richfaces-jakarta/build/build-resources/src/main/java/org/richfaces/arquillian/page/source/SourceChecker.java
/home/milo/workspace/richfaces-jakarta/build/build-resources/src/main/java/org/richfaces/arquillian/page/source/SourceChecker.java
/home/milo/workspace/richfaces-jakarta/core/src/test/java/org/richfaces/javascript/QUnitTest.java
/home/milo/workspace/richfaces-jakarta/core/src/test/java/org/richfaces/javascript/QUnitTest.java
/home/milo/workspace/richfaces-jakarta/core/src/test/java/org/richfaces/javascript/QUnitTest.java
/home/milo/workspace/richfaces-jakarta/core/src/test/java/org/richfaces/javascript/QUnitTest.java
/home/milo/workspace/richfaces-jakarta/core/src/test/java/org/richfaces/javascript/QUnitTest.java
/home/milo/workspace/richfaces-jakarta/core/src/test/java/org/richfaces/javascript/QUnitTest.java
END
)

while IFS= read -r file; do
  echo "File: $file"
  rm $file
done <<< $FILES
