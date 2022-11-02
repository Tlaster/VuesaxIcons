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

public val BrokenGroup.Chartsquare: ImageVector
    get() {
        if (_chartsquare != null) {
            return _chartsquare!!
        }
        _chartsquare = Builder(name = "Chartsquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.83f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.1103f, 11.1501f)
                horizontalLineTo(7.4603f)
                curveTo(6.8303f, 11.1501f, 6.3203f, 11.6601f, 6.3203f, 12.2901f)
                verticalLineTo(17.4101f)
                horizontalLineTo(10.1103f)
                verticalLineTo(11.1501f)
                verticalLineTo(11.1501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.7596f, 6.6001f)
                horizontalLineTo(11.2396f)
                curveTo(10.6096f, 6.6001f, 10.0996f, 7.1101f, 10.0996f, 7.7401f)
                verticalLineTo(17.4001f)
                horizontalLineTo(13.8896f)
                verticalLineTo(7.7401f)
                curveTo(13.8896f, 7.1101f, 13.3896f, 6.6001f, 12.7596f, 6.6001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5504f, 12.8501f)
                horizontalLineTo(13.9004f)
                verticalLineTo(17.4001f)
                horizontalLineTo(17.6904f)
                verticalLineTo(13.9901f)
                curveTo(17.6804f, 13.3601f, 17.1704f, 12.8501f, 16.5504f, 12.8501f)
                close()
            }
        }
        .build()
        return _chartsquare!!
    }

private var _chartsquare: ImageVector? = null
