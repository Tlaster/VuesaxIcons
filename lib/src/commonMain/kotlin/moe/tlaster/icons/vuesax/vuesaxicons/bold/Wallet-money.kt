package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Wallet-money`: ImageVector
    get() {
        if (`_wallet-money` != null) {
            return `_wallet-money`!!
        }
        `_wallet-money` = Builder(name = "Wallet-money", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.97f, 16.08f)
                curveTo(20.73f, 18.75f, 18.8f, 20.5f, 16.0f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(4.24f, 20.5f, 2.0f, 18.26f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 5.78f, 3.64f, 3.88f, 6.19f, 3.56f)
                curveTo(6.45f, 3.52f, 6.72f, 3.5f, 7.0f, 3.5f)
                horizontalLineTo(16.0f)
                curveTo(16.26f, 3.5f, 16.51f, 3.51f, 16.75f, 3.55f)
                curveTo(19.14f, 3.83f, 20.76f, 5.5f, 20.97f, 7.92f)
                curveTo(21.0f, 8.21f, 20.76f, 8.45f, 20.47f, 8.45f)
                horizontalLineTo(18.92f)
                curveTo(17.96f, 8.45f, 17.07f, 8.82f, 16.43f, 9.48f)
                curveTo(15.67f, 10.22f, 15.29f, 11.26f, 15.38f, 12.3f)
                curveTo(15.54f, 14.12f, 17.14f, 15.55f, 19.04f, 15.55f)
                horizontalLineTo(20.47f)
                curveTo(20.76f, 15.55f, 21.0f, 15.79f, 20.97f, 16.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0002f, 10.9692f)
                verticalLineTo(13.0292f)
                curveTo(22.0002f, 13.5792f, 21.5602f, 14.0292f, 21.0002f, 14.0492f)
                horizontalLineTo(19.0402f)
                curveTo(17.9602f, 14.0492f, 16.9702f, 13.2592f, 16.8802f, 12.1792f)
                curveTo(16.8202f, 11.5492f, 17.0602f, 10.9592f, 17.4802f, 10.5492f)
                curveTo(17.8502f, 10.1692f, 18.3602f, 9.9492f, 18.9202f, 9.9492f)
                horizontalLineTo(21.0002f)
                curveTo(21.5602f, 9.9692f, 22.0002f, 10.4192f, 22.0002f, 10.9692f)
                close()
            }
        }
        .build()
        return `_wallet-money`!!
    }

private var `_wallet-money`: ImageVector? = null
