package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.89f, 2.8782f)
                lineTo(9.2f, 2.1382f)
                curveTo(5.29f, 1.5282f, 3.48f, 2.8482f, 2.86f, 6.7582f)
                lineTo(2.12f, 11.4482f)
                curveTo(1.72f, 14.0082f, 2.14f, 15.6682f, 3.59f, 16.6782f)
                curveTo(4.35f, 17.2182f, 5.39f, 17.5782f, 6.74f, 17.7882f)
                lineTo(11.43f, 18.5282f)
                curveTo(15.34f, 19.1382f, 17.15f, 17.8182f, 17.77f, 13.9082f)
                lineTo(18.5f, 9.2182f)
                curveTo(18.62f, 8.4482f, 18.67f, 7.7582f, 18.63f, 7.1482f)
                curveTo(18.5f, 4.6482f, 17.03f, 3.3682f, 13.89f, 2.8782f)
                close()
                moveTo(8.24f, 9.3482f)
                curveTo(7.07f, 9.3482f, 6.12f, 8.3982f, 6.12f, 7.2382f)
                curveTo(6.12f, 6.0682f, 7.07f, 5.1182f, 8.24f, 5.1182f)
                curveTo(9.4f, 5.1182f, 10.35f, 6.0682f, 10.35f, 7.2382f)
                curveTo(10.35f, 8.3982f, 9.4f, 9.3482f, 8.24f, 9.3482f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5006f, 13.4686f)
                lineTo(19.0006f, 17.9786f)
                curveTo(17.7506f, 21.7386f, 15.7506f, 22.7386f, 11.9906f, 21.4886f)
                lineTo(7.4806f, 19.9886f)
                curveTo(6.0706f, 19.5186f, 5.0506f, 18.9386f, 4.3906f, 18.2086f)
                curveTo(5.0206f, 18.4586f, 5.7506f, 18.6486f, 6.5806f, 18.7786f)
                lineTo(11.2806f, 19.5186f)
                curveTo(11.9206f, 19.6186f, 12.5206f, 19.6686f, 13.0806f, 19.6686f)
                curveTo(16.3806f, 19.6686f, 18.1506f, 17.8886f, 18.7606f, 14.0586f)
                lineTo(19.4906f, 9.3686f)
                curveTo(19.5906f, 8.7886f, 19.6306f, 8.2786f, 19.6306f, 7.8086f)
                curveTo(21.1506f, 9.0586f, 21.3706f, 10.8386f, 20.5006f, 13.4686f)
                close()
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
