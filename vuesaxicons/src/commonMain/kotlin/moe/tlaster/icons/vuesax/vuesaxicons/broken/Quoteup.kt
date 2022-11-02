package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Quoteup: ImageVector
    get() {
        if (_quoteup != null) {
            return _quoteup!!
        }
        _quoteup = Builder(name = "Quoteup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.3702f, 18.1401f)
                curveTo(10.3702f, 19.5601f, 9.3202f, 20.72f, 7.7902f, 20.72f)
                horizontalLineTo(4.5703f)
                curveTo(3.1502f, 20.72f, 1.9902f, 19.5601f, 1.9902f, 18.1401f)
                lineTo(1.9902f, 12.3401f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.3501f)
                horizontalLineTo(7.8f)
                curveTo(8.76f, 12.3501f, 9.52f, 12.8001f, 9.96f, 13.4901f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.35f)
                curveTo(2.0f, 6.3f, 3.13f, 5.3f, 6.53f, 3.28f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.6309f, 12.3501f)
                horizontalLineTo(19.4308f)
                curveTo(20.9608f, 12.3501f, 22.0109f, 13.5101f, 22.0109f, 14.9301f)
                verticalLineTo(18.1501f)
                curveTo(22.0109f, 19.5701f, 20.9608f, 20.7301f, 19.4308f, 20.7301f)
                horizontalLineTo(16.2109f)
                curveTo(14.7909f, 20.7301f, 13.6309f, 19.5701f, 13.6309f, 18.1501f)
                verticalLineTo(12.3501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.6309f, 12.35f)
                curveTo(13.6309f, 6.3f, 14.7608f, 5.3f, 18.1608f, 3.28f)
            }
        }
        .build()
        return _quoteup!!
    }

private var _quoteup: ImageVector? = null
