/*
 * Copyright (c) 2018. terefang@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package terefang.gdx.contrib.g3d;

public interface IScene3dNodeAnimator<T extends IScene3dNodeAnimator> extends IScene3dEventReceiver, IScene3dCloneable<T>, IScene3dTyped
{
	public void animateNode(IScene3dAnimateable node, long timeMs);
	
	public void animateStart();
	public void animatePause();
	public void animateStop();
	
	public boolean hasFinished();
	
}
