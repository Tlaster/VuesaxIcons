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

public val BoldGroup.Rotateleft1: ImageVector
    get() {
        if (_rotateleft1 != null) {
            return _rotateleft1!!
        }
        _rotateleft1 = Builder(name = "Rotateleft1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 22.0f)
                horizontalLineTo(11.75f)
                curveTo(15.5f, 22.0f, 17.0f, 20.5f, 17.0f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(17.0f, 8.5f, 15.5f, 7.0f, 11.75f, 7.0f)
                horizontalLineTo(7.25f)
                curveTo(3.5f, 7.0f, 2.0f, 8.5f, 2.0f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(2.0f, 20.5f, 3.5f, 22.0f, 7.25f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2504f, 10.5f)
                curveTo(20.8404f, 10.5f, 20.5004f, 10.16f, 20.5004f, 9.75f)
                curveTo(20.5004f, 6.79f, 18.4404f, 4.31f, 15.6704f, 3.66f)
                lineTo(15.9404f, 4.11f)
                curveTo(16.1504f, 4.47f, 16.0404f, 4.93f, 15.6804f, 5.14f)
                curveTo(15.3204f, 5.35f, 14.8604f, 5.24f, 14.6504f, 4.88f)
                lineTo(13.6004f, 3.13f)
                curveTo(13.4604f, 2.9f, 13.4604f, 2.61f, 13.5904f, 2.38f)
                curveTo(13.7304f, 2.15f, 13.9804f, 2.0f, 14.2504f, 2.0f)
                curveTo(18.5204f, 2.0f, 22.0004f, 5.48f, 22.0004f, 9.75f)
                curveTo(22.0004f, 10.16f, 21.6604f, 10.5f, 21.2504f, 10.5f)
                close()
            }
        }
        .build()
        return _rotateleft1!!
    }

private var _rotateleft1: ImageVector? = null
