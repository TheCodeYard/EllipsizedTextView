# EllipsizedTextView
A simple TextView that supports custom `ellipsis` as well as `ellipsisColor`. Drawing a text is a heavy operation and in order to not compromise the performance, `EllipsizedTextView` generates the ellipsized the text in the `onMeasure`, before it is drawn.

- Extends `AppCompatTextView`.
- Supports all `ellipsize` modes (`start`, `end`, `middle`, `marquee`).
- Respects `Spanned` texts.
- Does not draw the text more times than a regular `TextView` would.

## Usage
```
    <com.thecodeyard.ellipsizedtextview.EllipsizedTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:maxLines="2"
        android:ellipsize="end"
        android:text="@string/long_text"
        app:ellipsis="@string/ellipsis"
        app:ellipsisColor="@color/colorAccent"/>
```
## Download
```
dependencies {
  implementation 'com.thecodeyard.android:ellipsizedtextview:1.0.0'
}
```
## License
Copyright 2018 The Code Yard

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
