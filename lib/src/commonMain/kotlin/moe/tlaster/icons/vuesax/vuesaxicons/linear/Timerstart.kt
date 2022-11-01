package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Timerstart: ImageVector
    get() {
        if (_timerstart != null) {
            return _timerstart!!
        }
        _timerstart = Builder(name = "Timerstart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                verticalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(7.17f, 22.0f, 3.25f, 18.08f, 3.25f, 13.25f)
                curveTo(3.25f, 8.42f, 7.17f, 4.5f, 12.0f, 4.5f)
                curveTo(16.83f, 4.5f, 20.75f, 8.42f, 20.75f, 13.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                horizontalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.9f, 18.5f)
                verticalLineTo(17.34f)
                curveTo(14.9f, 15.91f, 15.92f, 15.32f, 17.16f, 16.04f)
                lineTo(18.16f, 16.62f)
                lineTo(19.16f, 17.2f)
                curveTo(20.4f, 17.92f, 20.4f, 19.09f, 19.16f, 19.81f)
                lineTo(18.16f, 20.39f)
                lineTo(17.16f, 20.97f)
                curveTo(15.92f, 21.69f, 14.9f, 21.1f, 14.9f, 19.67f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _timerstart!!
    }

private var _timerstart: ImageVector? = null
