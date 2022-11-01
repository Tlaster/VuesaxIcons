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

public val LinearGroup.`Gas-station`: ImageVector
    get() {
        if (`_gas-station` != null) {
            return `_gas-station`!!
        }
        `_gas-station` = Builder(name = "Gas-station", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 22.0f)
                verticalLineTo(5.0f)
                curveTo(3.5f, 3.0f, 4.84f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(16.16f, 2.0f, 17.5f, 3.0f, 17.5f, 5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                horizontalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.39f, 10.0f)
                horizontalLineTo(12.62f)
                curveTo(13.66f, 10.0f, 14.51f, 9.5f, 14.51f, 8.11f)
                verticalLineTo(6.88f)
                curveTo(14.51f, 5.49f, 13.66f, 4.99f, 12.62f, 4.99f)
                horizontalLineTo(8.39f)
                curveTo(7.35f, 4.99f, 6.5f, 5.49f, 6.5f, 6.88f)
                verticalLineTo(8.11f)
                curveTo(6.5f, 9.5f, 7.35f, 10.0f, 8.39f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 13.0f)
                horizontalLineTo(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 16.01f)
                lineTo(22.0f, 16.0f)
                verticalLineTo(10.0f)
                lineTo(20.0f, 9.0f)
            }
        }
        .build()
        return `_gas-station`!!
    }

private var `_gas-station`: ImageVector? = null
