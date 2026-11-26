១. តើ LinkedList គឺជាអ្វី?

LinkedList គឺជា Data Structure មួយប្រភេទស្ថិតក្នុងកញ្ចប់ java.util.LinkedList ដែលអនុវត្ត (Implement) ទាំង List និង Deque (Double-ended Queue)។

ខុសពី ArrayList ដែលផ្ទុកទិន្នន័យជាប្រអប់ Array ជាប់ៗគ្នាក្នុង Memory គឺ LinkedList ផ្ទុកទិន្នន័យជាកង់ៗហៅថា Nodes (ថ្នាំង) ហើយភ្ជាប់គ្នាទៅវិញទៅមកតាមរយៈខ្សែចម្លង (Pointers/Links) ដូចជា រទេះភ្លើង អ៊ីចឹងដែរ៖

[null] ◄─ [Node 1] ◄───► [Node 2] ◄───► [Node 3] ─► [null]
         (Apple)        (Banana)       (Orange)

រាល់ Node នីមួយៗផ្ទុកនូវ ៣ យ៉ាង៖

1Data (ទិន្នន័យជាក់ស្តែង ឧ. "Apple")
2Next (អាសយដ្ឋានចង្អុលទៅ Node បន្ទាប់)
3Prev (អាសយដ្ឋានចង្អុលថយក្រោយទៅ Node មុន)
(គេហៅវាថា Doubly Linked List)




២. ការប្រៀបធៀបធំ៖ ArrayList vs LinkedList

តើពេលណាគួរប្រើមួយណា? នេះជាសំណួរដែលគេសួរញឹកញាប់បំផុតក្នុងកិច្ចសម្ភាសន៍ការងារ (Interview Question)៖

-- ទាញយកទិន្នន័យ(get index), បន្ថែម/លុបនៅខាងដើម(remove/add), ការស៊ី Memory

A| លក្ខណៈ | `ArrayList` | `LinkedList` |
| --- | --- | --- |
| រចនាសម្ព័ន្ធខាងក្នុង | Dynamic Array (ប្រអប់ជាប់ៗគ្នា) | Doubly Linked List (Nodes ភ្ជាប់គ្នា) |
| ទាញយកទិន្នន័យ (`get(index)`) | លឿនបំផុត (O(1)O(1)O(1)) ព្រោះលោតទៅចំ index ភ្លាមៗ | យឺត (O(n)O(n)O(n)) ព្រោះត្រូវរាប់ដើរពីក្បាលទៅម្តងមួយ Node |
| បន្ថែម/លុបនៅខាងដើម (`add/remove`) | យឺត (O(n)O(n)O(n)) ព្រោះត្រូវរុញធាតុដទៃទៀតទាំងអស់ទៅក្រោយ | លឿនបំផុត (O(1)O(1)O(1)) គ្រាន់តែដោះដូរខ្សែភ្ជាប់ Node ប៉ុណ្ណោះ |
| ការស៊ី Memory | ស៊ី Memory តិចជាង | ស៊ី Memory ច្រើនជាង (ព្រោះត្រូវចំណាយកន្លែងចាំអាសយដ្ឋាន `prev` និង `next`) |


💡 សន្និដ្ឋានខ្លី៖
    -បើកម្មវិធីរបស់អ្នកត្រូវការ ស្វែងរក និងទាញយកទិន្នន័យមើលញឹកញាប់ (Search / Read) ➡️ ជ្រើសរើស ArrayList

    -បើកម្មវិធីរបស់អ្នកត្រូវការ បន្ថែម ឬលុបទិន្នន័យនៅខាងដើម ឬកណ្តាលញឹកញាប់ (Insert / Delete) ➡️ ជ្រើសរើស LinkedList

៣. Methods ពិសេសរបស់ LinkedList

ក្រៅពី Methods ទូទៅរបស់ List (ដូចជា add, get, remove, size) LinkedList មាន Methods ពិសេសបន្ថែមសម្រាប់គ្រប់គ្រងក្បាល និងកន្ទុយ៖

addFirst(item) ៖ បន្ថែមនៅក្បាលគេបង្អស់
addLast(item) ៖ បន្ថែមនៅកន្ទុយគេបង្អស់
getFirst() ៖ មើលធាតុនៅក្បាលគេ
getLast() ៖ មើលធាតុនៅកន្ទុយគេ
removeFirst() ៖ លុបធាតុនៅក្បាលគេចេញ
removeLast() ៖ លុបធាតុនៅកន្ទុយគេចេញ


Safe Methods vs Unsafe Methods (ការពារកុំឱ្យកម្មវិធី Crash)

តើមានអ្វីកើតឡើងប្រសិនបើ LinkedList ទទេ (Empty) ហើយអ្នកហៅ getFirst() ឬ removeFirst()?
👉 កម្មវិធីនឹង Crash ដោយចេញ Error NoSuchElementException!

ដូច្នេះ LinkedList មាន Methods សុវត្ថិភាព (Safe Methods) ដែលពេលទទេវាគ្រាន់តែ Return null ប៉ុណ្ណោះ៖

| សកម្មភាព | វិធីធម្មតា (អាច Crash បើទទេ) | វិធីសុវត្ថិភាព (Return `null` បើទទេ) ✅ |
| --- | --- | --- |
| មើលធាតុដើមគេ | `getFirst()` | `peekFirst()` ឬ `peek()` |
| មើលធាតុចុងគេ | `getLast()` | `peekLast()` |
| ដកធាតុដើមគេចេញ | `removeFirst()` | `pollFirst()` ឬ `poll()` |
| ដកធាតុចុងគេចេញ | `removeLast()` | `pollLast()` |
| បន្ថែមនៅដើម/ចុង | `addFirst()` / `addLast()` | `offerFirst()` / `offerLast()` |



៣. ការប្រើ LinkedList ជា Stack (LIFO) និង Queue (FIFO)
ដោយសារ LinkedList អនុវត្ត Deque វាអាចដើរតួបាន ២ បន្ថែមទៀតក្រៅពី List៖

Queue (FIFO - ចូលមុន ចេញមុន): ដូចជួរទិញកាហ្វេ ឬ Queue បោះពុម្ពឯកសារ។
ប្រើ offer() (ដាក់ចូលចុងជួរ) និង poll() (ដកចេញពីមុខជួរ)។
Stack (LIFO - ចូលក្រោយ ចេញមុន): ដូចជាប៊ូតុង Undo / Redo ឬប៊ូតុង Back លើ Browser។
ប្រើ push() (ដាក់នៅលើគេ) និង pop() (ដកអាលើគេចេញ)៖