/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

RichFaces.QUnit.run(function() {
    module("richfaces-queue-getSize");

    QUnit.testDone(function(context) {
        RichFaces.queue.clear();
    });
    
    // queue.getSize
    test("RichFaces.queue.getSize", function() {
        expect(2);
        
        var element = document.getElementById("testDiv");
        var event = {type:"testevent"};
        var options = {requestDelay:1000};
        var opts = {queueId:"myQueueGetSize", param:"value"};
        
        RichFaces.queue.setQueueOptions(opts.queueId, options);
        var size = RichFaces.queue.getSize();
        equal(size, 0, "empty queue");
        faces.ajax.request(element, event, opts);
        size = RichFaces.queue.getSize();
        equal(size, 1, "not empty");
    });
});
