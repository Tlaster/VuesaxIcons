package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Walletmoney: ImageVector
    get() {
        if (_walletmoney != null) {
            return _walletmoney!!
        }
        _walletmoney = Builder(name = "Walletmoney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.48f, 10.55f)
                curveTo(17.06f, 10.96f, 16.82f, 11.55f, 16.88f, 12.18f)
                curveTo(16.97f, 13.26f, 17.96f, 14.05f, 19.04f, 14.05f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.5f)
                curveTo(21.0f, 18.5f, 19.0f, 20.5f, 16.0f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 20.5f, 2.0f, 18.5f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 5.78f, 3.64f, 3.88f, 6.19f, 3.56f)
                curveTo(6.45f, 3.52f, 6.72f, 3.5f, 7.0f, 3.5f)
                horizontalLineTo(16.0f)
                curveTo(16.26f, 3.5f, 16.51f, 3.51f, 16.75f, 3.55f)
                curveTo(19.33f, 3.85f, 21.0f, 5.76f, 21.0f, 8.5f)
                verticalLineTo(9.95f)
                horizontalLineTo(18.92f)
                curveTo(18.36f, 9.95f, 17.85f, 10.17f, 17.48f, 10.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0002f, 10.9702f)
                verticalLineTo(13.0302f)
                curveTo(22.0002f, 13.5802f, 21.5602f, 14.0302f, 21.0002f, 14.0502f)
                horizontalLineTo(19.0402f)
                curveTo(17.9602f, 14.0502f, 16.9702f, 13.2602f, 16.8802f, 12.1802f)
                curveTo(16.8202f, 11.5502f, 17.0602f, 10.9602f, 17.4802f, 10.5502f)
                curveTo(17.8502f, 10.1702f, 18.3602f, 9.9502f, 18.9202f, 9.9502f)
                horizontalLineTo(21.0002f)
                curveTo(21.5602f, 9.9702f, 22.0002f, 10.4202f, 22.0002f, 10.9702f)
                close()
            }
        }
        .build()
        return _walletmoney!!
    }

private var _walletmoney: ImageVector? = null
