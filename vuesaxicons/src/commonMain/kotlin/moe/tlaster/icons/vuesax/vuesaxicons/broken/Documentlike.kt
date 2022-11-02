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

public val BrokenGroup.Documentlike: ImageVector
    get() {
        if (_documentlike != null) {
            return _documentlike!!
        }
        _documentlike = Builder(name = "Documentlike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                curveTo(3.0f, 4.0f, 4.5f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(19.5f, 2.0f, 21.0f, 4.0f, 21.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 20.0f, 19.5f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(4.5f, 22.0f, 3.0f, 20.0f, 3.0f, 17.0f)
                verticalLineTo(11.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(14.5f, 7.6f, 15.4f, 8.5f, 16.5f, 8.5f)
                horizontalLineTo(18.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.4792f, 15.4901f)
                curveTo(7.1492f, 14.4601f, 7.5391f, 13.1901f, 8.6091f, 12.8401f)
                curveTo(9.1791f, 12.6601f, 9.8791f, 12.8101f, 10.2691f, 13.3601f)
                curveTo(10.6391f, 12.7901f, 11.3691f, 12.6601f, 11.9291f, 12.8401f)
                curveTo(13.0091f, 13.1901f, 13.3892f, 14.4601f, 13.0692f, 15.4901f)
                curveTo(12.5592f, 17.1201f, 10.7691f, 17.9701f, 10.2691f, 17.9701f)
                curveTo(9.7791f, 17.9601f, 8.0092f, 17.1301f, 7.4792f, 15.4901f)
                close()
            }
        }
        .build()
        return _documentlike!!
    }

private var _documentlike: ImageVector? = null
