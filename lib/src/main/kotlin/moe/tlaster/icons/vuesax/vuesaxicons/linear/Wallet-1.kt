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

public val LinearGroup.`Wallet-1`: ImageVector
    get() {
        if (`_wallet-1` != null) {
            return `_wallet-1`!!
        }
        `_wallet-1` = Builder(name = "Wallet-1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 22.0f, 2.0f, 20.0f, 2.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 9.28f, 3.64f, 7.38f, 6.19f, 7.06f)
                curveTo(6.45f, 7.02f, 6.72f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(17.0f)
                curveTo(17.26f, 7.0f, 17.51f, 7.01f, 17.75f, 7.05f)
                curveTo(20.33f, 7.35f, 22.0f, 9.26f, 22.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.7514f, 7.05f)
                curveTo(17.5114f, 7.01f, 17.2614f, 7.0f, 17.0014f, 7.0f)
                horizontalLineTo(7.0014f)
                curveTo(6.7214f, 7.0f, 6.4514f, 7.02f, 6.1914f, 7.06f)
                curveTo(6.3314f, 6.78f, 6.5314f, 6.52f, 6.7714f, 6.28f)
                lineTo(10.0214f, 3.02f)
                curveTo(11.3914f, 1.66f, 13.6114f, 1.66f, 14.9814f, 3.02f)
                lineTo(16.7314f, 4.79f)
                curveTo(17.3714f, 5.42f, 17.7114f, 6.22f, 17.7514f, 7.05f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.5f)
                horizontalLineTo(19.0f)
                curveTo(17.9f, 12.5f, 17.0f, 13.4f, 17.0f, 14.5f)
                curveTo(17.0f, 15.6f, 17.9f, 16.5f, 19.0f, 16.5f)
                horizontalLineTo(22.0f)
            }
        }
        .build()
        return `_wallet-1`!!
    }

private var `_wallet-1`: ImageVector? = null
