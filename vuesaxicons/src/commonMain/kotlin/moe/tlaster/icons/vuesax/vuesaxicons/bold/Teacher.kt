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

public val BoldGroup.Teacher: ImageVector
    get() {
        if (_teacher != null) {
            return _teacher!!
        }
        _teacher = Builder(name = "Teacher", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8311f, 15.6402f)
                curveTo(17.5011f, 15.2002f, 18.3811f, 15.6802f, 18.3811f, 16.4802f)
                verticalLineTo(17.7702f)
                curveTo(18.3811f, 19.0402f, 17.3911f, 20.4002f, 16.2011f, 20.8002f)
                lineTo(13.0111f, 21.8602f)
                curveTo(12.4511f, 22.0502f, 11.5411f, 22.0502f, 10.9911f, 21.8602f)
                lineTo(7.8011f, 20.8002f)
                curveTo(6.6011f, 20.4002f, 5.6211f, 19.0402f, 5.6211f, 17.7702f)
                verticalLineTo(16.4702f)
                curveTo(5.6211f, 15.6802f, 6.5011f, 15.2002f, 7.1611f, 15.6302f)
                lineTo(9.2211f, 16.9702f)
                curveTo(10.0111f, 17.5002f, 11.0111f, 17.7602f, 12.0111f, 17.7602f)
                curveTo(13.0111f, 17.7602f, 14.0111f, 17.5002f, 14.8011f, 16.9702f)
                lineTo(16.8311f, 15.6402f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9795f, 6.4586f)
                lineTo(13.9895f, 2.5286f)
                curveTo(12.9095f, 1.8186f, 11.1295f, 1.8186f, 10.0495f, 2.5286f)
                lineTo(4.0295f, 6.4586f)
                curveTo(2.0995f, 7.7086f, 2.0995f, 10.5386f, 4.0295f, 11.7986f)
                lineTo(5.6295f, 12.8386f)
                lineTo(10.0495f, 15.7186f)
                curveTo(11.1295f, 16.4286f, 12.9095f, 16.4286f, 13.9895f, 15.7186f)
                lineTo(18.3795f, 12.8386f)
                lineTo(19.7495f, 11.9386f)
                verticalLineTo(14.9986f)
                curveTo(19.7495f, 15.4086f, 20.0895f, 15.7486f, 20.4995f, 15.7486f)
                curveTo(20.9095f, 15.7486f, 21.2495f, 15.4086f, 21.2495f, 14.9986f)
                verticalLineTo(10.0786f)
                curveTo(21.6495f, 8.7886f, 21.2395f, 7.2886f, 19.9795f, 6.4586f)
                close()
            }
        }
        .build()
        return _teacher!!
    }

private var _teacher: ImageVector? = null
