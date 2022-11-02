package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Copysuccess: ImageVector
    get() {
        if (_copysuccess != null) {
            return _copysuccess!!
        }
        _copysuccess = Builder(name = "Copysuccess", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.1f)
                verticalLineTo(6.9f)
                curveTo(22.0f, 3.4f, 20.6f, 2.0f, 17.1f, 2.0f)
                horizontalLineTo(12.9f)
                curveTo(9.4f, 2.0f, 8.0f, 3.4f, 8.0f, 6.9f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.1f)
                curveTo(14.6f, 8.0f, 16.0f, 9.4f, 16.0f, 12.9f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.1f)
                curveTo(20.6f, 16.0f, 22.0f, 14.6f, 22.0f, 11.1f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 17.1f)
                verticalLineTo(12.9f)
                curveTo(16.0f, 9.4f, 14.6f, 8.0f, 11.1f, 8.0f)
                horizontalLineTo(6.9f)
                curveTo(3.4f, 8.0f, 2.0f, 9.4f, 2.0f, 12.9f)
                verticalLineTo(17.1f)
                curveTo(2.0f, 20.6f, 3.4f, 22.0f, 6.9f, 22.0f)
                horizontalLineTo(11.1f)
                curveTo(14.6f, 22.0f, 16.0f, 20.6f, 16.0f, 17.1f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0801f, 14.9998f)
                lineTo(8.0301f, 16.9498f)
                lineTo(11.9201f, 13.0498f)
            }
        }
        .build()
        return _copysuccess!!
    }

private var _copysuccess: ImageVector? = null
