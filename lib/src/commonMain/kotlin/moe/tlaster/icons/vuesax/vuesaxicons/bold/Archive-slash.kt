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

public val BoldGroup.`Archive-slash`: ImageVector
    get() {
        if (`_archive-slash` != null) {
            return `_archive-slash`!!
        }
        `_archive-slash` = Builder(name = "Archive-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.1203f, 3.88f)
                lineTo(3.3903f, 20.61f)
                curveTo(3.3403f, 20.41f, 3.3203f, 20.19f, 3.3203f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(3.3203f, 3.74f, 5.0503f, 2.0f, 7.1803f, 2.0f)
                horizontalLineTo(16.8203f)
                curveTo(18.2203f, 2.0f, 19.4503f, 2.75f, 20.1203f, 3.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7709f, 2.2289f)
                curveTo(21.4709f, 1.9289f, 20.9809f, 1.9289f, 20.6809f, 2.2289f)
                lineTo(2.2309f, 20.6889f)
                curveTo(1.9309f, 20.9889f, 1.9309f, 21.4789f, 2.2309f, 21.7789f)
                curveTo(2.3809f, 21.9189f, 2.5709f, 21.9989f, 2.7709f, 21.9989f)
                curveTo(2.9709f, 21.9989f, 3.1609f, 21.9189f, 3.3109f, 21.7689f)
                lineTo(21.7709f, 3.3089f)
                curveTo(22.0809f, 3.0089f, 22.0809f, 2.5289f, 21.7709f, 2.2289f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2902f, 7.7105f)
                lineTo(11.9001f, 15.1005f)
                curveTo(11.4401f, 15.5605f, 11.5301f, 16.3305f, 12.0901f, 16.6605f)
                lineTo(19.4801f, 21.0905f)
                curveTo(20.1501f, 21.4905f, 20.9901f, 21.0105f, 20.9901f, 20.2305f)
                verticalLineTo(8.4105f)
                curveTo(21.0001f, 7.5205f, 19.9202f, 7.0805f, 19.2902f, 7.7105f)
                close()
            }
        }
        .build()
        return `_archive-slash`!!
    }

private var `_archive-slash`: ImageVector? = null
