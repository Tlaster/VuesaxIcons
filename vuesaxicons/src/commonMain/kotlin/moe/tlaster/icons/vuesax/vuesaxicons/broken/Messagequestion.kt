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

public val BrokenGroup.Messagequestion: ImageVector
    get() {
        if (_messagequestion != null) {
            return _messagequestion!!
        }
        _messagequestion = Builder(name = "Messagequestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 11.5599f)
                verticalLineTo(13.43f)
                curveTo(2.0f, 16.43f, 4.0f, 18.43f, 7.0f, 18.43f)
                horizontalLineTo(11.0f)
                lineTo(15.45f, 21.39f)
                curveTo(16.11f, 21.83f, 17.0f, 21.36f, 17.0f, 20.56f)
                verticalLineTo(18.43f)
                curveTo(20.0f, 18.43f, 22.0f, 16.43f, 22.0f, 13.43f)
                verticalLineTo(7.4299f)
                curveTo(22.0f, 4.4299f, 20.0f, 2.4299f, 17.0f, 2.4299f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 2.4299f, 2.0f, 4.4299f, 2.0f, 7.4299f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9998f, 11.36f)
                verticalLineTo(11.15f)
                curveTo(11.9998f, 10.47f, 12.4198f, 10.11f, 12.8398f, 9.82f)
                curveTo(13.2498f, 9.54f, 13.6598f, 9.18f, 13.6598f, 8.52f)
                curveTo(13.6598f, 7.6f, 12.9198f, 6.86f, 11.9998f, 6.86f)
                curveTo(11.0798f, 6.86f, 10.3398f, 7.6f, 10.3398f, 8.52f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9955f, 13.75f)
                horizontalLineTo(12.0045f)
            }
        }
        .build()
        return _messagequestion!!
    }

private var _messagequestion: ImageVector? = null
