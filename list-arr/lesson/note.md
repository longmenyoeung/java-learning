នៅក្នុងភាសា Java ពាក្យថា ArrayList គឺជាប្រភេទ Dynamic Array (Array ដែលអាចបត់បែនទំហំបានដោយស្វ័យប្រវត្តិ) ដែលស្ថិតនៅក្នុងកញ្ចប់ java.util.ArrayList។


១. ភាពខុសគ្នារវាង Array ធម្មតា និង ArrayList
| លក្ខណៈ | Array ធម្មតា | ArrayList |
| --- | --- | --- |
| ទំហំ (Size) | ទំហំថេរ (Fixed size) – ពេលកំណត់ហើយ មិនអាចបន្ថែម ឬបន្ថយបានទេ | ទំហំប្រែប្រួល (Dynamic size) – អាចបន្ថែម ឬលុបធាតុបានតាមចិត្ត |
| ប្រភេទទិន្នន័យ | ផ្ទុកបានទាំង Primitive type (`int`, `char`, ...) និង Object | ផ្ទុកបានតែ Object / Wrapper Class (`Integer`, `String`, ...) |
| ល្បឿន & Memory | ដំណើរការលឿនជាង និងស៊ី memory តិចជាង | មាន Functions ស្រាប់ច្រើនជាង តែស៊ី memory ច្រើនជាងបន្តិច |

២. របៀបបង្កើត (Syntax)

ដើម្បីប្រើប្រាស់ ArrayList អ្នកត្រូវ import java.util.ArrayList; ជាមុនសិន។
import java.util.ArrayList;

// ទម្រង់ទូទៅ៖
ArrayList<ប្រភេទObject> ឈ្មោះList = new ArrayList<>();


ចំណាំសំខាន់ (Wrapper Class): ArrayList មិនអាចប្រើ Primitive Types ផ្ទាល់បានទេ ត្រូវប្រើ Wrapper Class ជំនួសវិញ៖

int ➡️ Integer
double ➡️ Double
boolean ➡️ Boolean
char ➡️ Character



៣. Methods សំខាន់ៗដែលនិយមប្រើ
add(value) ៖ បន្ថែមធាតុថ្មីទៅក្នុង List
get(index) ៖ ទាញយកតម្លៃតាមលេខរៀង Index (ចាប់ផ្ដើមរាប់ពី 0)
set(index, newValue) ៖ កែប្រែតម្លៃត្រង់ Index ណាមួយ
remove(index) ៖ លុបធាតុចេញតាម Index
size() ៖ រាប់ចំនួនធាតុសរុបដែលមាននៅក្នុង List
clear() ៖ លុបសម្អាតធាតុទាំងអស់ចេញពី List