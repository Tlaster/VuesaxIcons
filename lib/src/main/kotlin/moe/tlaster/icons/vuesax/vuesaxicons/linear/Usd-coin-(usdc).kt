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

public val LinearGroup.`Usd-coin-(usdc)`: ImageVector
    get() {
        if (`_usd-coin-(usdc)` != null) {
            return `_usd-coin-(usdc)`!!
        }
        `_usd-coin-(usdc)` = Builder(name = "Usd-coin-(usdc)", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.8999f, 16.9f)
                curveTo(19.5999f, 14.2f, 19.5999f, 9.7f, 16.8999f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.1002f, 7.1001f)
                curveTo(4.4002f, 9.8001f, 4.4002f, 14.3001f, 7.1002f, 17.0001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.7002f, 13.6f)
                curveTo(9.7002f, 14.5f, 10.4002f, 15.2f, 11.3002f, 15.2f)
                horizontalLineTo(13.0002f)
                curveTo(13.7002f, 15.2f, 14.4002f, 14.6f, 14.4002f, 13.8f)
                curveTo(14.4002f, 12.9f, 14.0002f, 12.6f, 13.5002f, 12.4f)
                lineTo(10.7002f, 11.4f)
                curveTo(10.0002f, 11.3f, 9.7002f, 11.0f, 9.7002f, 10.2f)
                curveTo(9.7002f, 9.4001f, 10.3002f, 8.8f, 11.1002f, 8.8f)
                horizontalLineTo(12.9002f)
                curveTo(13.8002f, 8.8f, 14.5002f, 9.5f, 14.5002f, 10.4f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.8f)
                verticalLineTo(16.2f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_usd-coin-(usdc)`!!
    }

private var `_usd-coin-(usdc)`: ImageVector? = null
