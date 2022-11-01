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

public val LinearGroup.`Wallet-search`: ImageVector
    get() {
        if (`_wallet-search` != null) {
            return `_wallet-search`!!
        }
        `_wallet-search` = Builder(name = "Wallet-search", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 9.3f, 20.3f, 7.3f, 17.8f, 7.0f)
                curveTo(17.6f, 7.0f, 17.3f, 7.0f, 17.0f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(6.7f, 7.0f, 6.5f, 7.0f, 6.2f, 7.1f)
                curveTo(3.6f, 7.4f, 2.0f, 9.3f, 2.0f, 12.0f)
                curveTo(2.0f, 12.3f, 2.0f, 12.7f, 2.0f, 13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8f, 6.9999f)
                curveTo(17.6f, 6.9999f, 17.3f, 6.9999f, 17.0f, 6.9999f)
                horizontalLineTo(6.9999f)
                curveTo(6.7f, 6.9999f, 6.4999f, 6.9999f, 6.2f, 7.0999f)
                curveTo(6.3f, 6.7999f, 6.5f, 6.5999f, 6.8f, 6.2999f)
                lineTo(10.0f, 2.9999f)
                curveTo(11.4f, 1.5999f, 13.6f, 1.5999f, 15.0f, 2.9999f)
                lineTo(16.8f, 4.7999f)
                curveTo(17.4f, 5.3999f, 17.7f, 6.2f, 17.8f, 6.9999f)
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.8016f, 21.4f)
                curveTo(7.5716f, 21.4f, 9.0016f, 19.97f, 9.0016f, 18.2f)
                curveTo(9.0016f, 16.43f, 7.5716f, 15.0f, 5.8016f, 15.0f)
                curveTo(4.0316f, 15.0f, 2.6016f, 16.43f, 2.6016f, 18.2f)
                curveTo(2.6016f, 19.97f, 4.0316f, 21.4f, 5.8016f, 21.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                lineTo(3.0f, 21.0f)
            }
        }
        .build()
        return `_wallet-search`!!
    }

private var `_wallet-search`: ImageVector? = null
