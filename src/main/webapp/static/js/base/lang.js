define([], function(){
	return {
		getProp : function(/*Array*/parts, /*Boolean*/create, /*Object*/context){
			var p, i = 0;
			while(context && (p = parts[i++])){
				context = (p in context ? context[p] : (create ? context[p] = {} : undefined));
			}
			return context; // mixed
		},
		
		getObject : function(name, create, context){
			return this.getProp(name.split("."), create, context);
		}
	};
});