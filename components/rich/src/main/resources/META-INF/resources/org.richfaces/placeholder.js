(function($, rf) {

	rf.ui = rf.ui || {};

	var defaultOptions = {
		useNative: true
	};

	rf.ui.Placeholder = rf.BaseComponent.extendClass({

		name: "Placeholder",

		/**
		 * Backing object for rich:placeholder
		 * 
		 * @extends RichFaces.BaseComponent
		 * @memberOf! RichFaces.ui
		 * @constructs RichFaces.ui.PlaceHolder
		 * 
		 * @param componentId
		 * @param options
		 */
		init: function(componentId, options) {
			$super.constructor.call(this, componentId);
			options = $.extend({}, defaultOptions, options);
			this.attachToDom(this.id);
			$(function() {
				options.className = 'rf-plhdr ' + ((options.styleClass) ? options.styleClass : '');
				var elements = (options.selector) ? $(options.selector) : $(document.getElementById(options.targetId));
				// finds all inputs within the subtree of target elements
				var inputs = elements.find('*').addBack().filter(':editable');
				inputs.attr("placeholder", options.text);
			});

		},
		// destructor definition
		destroy: function() {
			// define destructor if additional cleaning is needed but
			// in most cases its not nessesary.
			// call parent’s destructor
			$super.destroy.call(this);
		}
	});

	// define super class reference - reference to the parent prototype
	var $super = rf.ui.Placeholder.$super;
})(RichFaces.jQuery, RichFaces);