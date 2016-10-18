//
verbs=['lived','headed','blowing','lined'];
nouns=['Raju','Ajja','farm','orchard','summer','city'];
paragraph="Raju lived in the city. But in the summer, when school was out, he headed straight for his Ajja's farm in the village. One summer evening, Raju and Ajja went on one of their regular evening walks to an orchard a little outside the village. A cool breeze was blowing, and green fields lined both sides of the road.";

function randomWordPicker(str){
	var sentence=randomSentencePicker(str);
    var words=sentence[1].split(/\W+/g);
	var x=Math.floor(Math.random()*(words.length));
	var result=[], type='';
	while(verbs.indexOf(words[x])===-1 && nouns.indexOf(words[x])===-1)
		x=Math.floor(Math.random()*(words.length));
	if(verbs.indexOf(words[x])!==-1)
		type='verb';
	if(nouns.indexOf(words[x])!==-1)
		type='noun';
	result.push(words[x],type,sentence[1]);
	return result;
}


function randomSentencePicker(str){
	var sentence=str.split('.');
	var x=Math.floor(Math.random()*(sentence.length));
	var result=[];
	result.push(x,sentence[x]);
	return result;
}

function makeQuestion(str){
	var inputs=randomWordPicker(str);
	var word=inputs[0];
	var type=inputs[1];
    var sentence=inputs[2];
	var place=sentence.indexOf(word);
	var blank='';
	for(var i=0;i<word.length;i++){
		blank+='_';
	}
  console.log(word,blank,sentence);
  var question=sentence.substr(0,place)+blank+sentence.substr(place+word.length,sentence.length);

	return question;
}

//console.log(randomSentencePicker(paragraph));
console.log(makeBlanks(paragraph));
