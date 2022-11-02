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

public val BrokenGroup.Emptywallet: ImageVector
    get() {
        if (_emptywallet != null) {
            return _emptywallet!!
        }
        _emptywallet = Builder(name = "Emptywallet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 14.07f)
                verticalLineTo(11.51f)
                curveTo(2.5f, 9.44f, 4.19f, 7.75f, 6.26f, 7.75f)
                horizontalLineTo(17.74f)
                curveTo(19.81f, 7.75f, 21.5f, 9.44f, 21.5f, 11.51f)
                verticalLineTo(12.95f)
                horizontalLineTo(19.48f)
                curveTo(18.92f, 12.95f, 18.41f, 13.17f, 18.04f, 13.55f)
                curveTo(17.62f, 13.96f, 17.38f, 14.55f, 17.44f, 15.18f)
                curveTo(17.53f, 16.26f, 18.52f, 17.05f, 19.6f, 17.05f)
                horizontalLineTo(21.5f)
                verticalLineTo(18.24f)
                curveTo(21.5f, 20.31f, 19.81f, 22.0f, 17.74f, 22.0f)
                horizontalLineTo(6.26f)
                curveTo(4.19f, 22.0f, 2.5f, 20.31f, 2.5f, 18.24f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.2793f, 2.1698f)
                curveTo(13.5193f, 1.6998f, 14.8493f, 2.6198f, 14.8493f, 3.9499f)
                verticalLineTo(7.7498f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 12.4099f)
                verticalLineTo(7.84f)
                curveTo(2.5f, 6.65f, 3.23f, 5.5899f, 4.34f, 5.1699f)
                lineTo(8.31f, 3.6699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.5608f, 13.9702f)
                verticalLineTo(16.0302f)
                curveTo(22.5608f, 16.5802f, 22.1208f, 17.0302f, 21.5608f, 17.0502f)
                horizontalLineTo(19.6008f)
                curveTo(18.5208f, 17.0502f, 17.5308f, 16.2602f, 17.4408f, 15.1802f)
                curveTo(17.3808f, 14.5502f, 17.6208f, 13.9602f, 18.0408f, 13.5502f)
                curveTo(18.4108f, 13.1702f, 18.9208f, 12.9502f, 19.4808f, 12.9502f)
                horizontalLineTo(21.5608f)
                curveTo(22.1208f, 12.9702f, 22.5608f, 13.4202f, 22.5608f, 13.9702f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                horizontalLineTo(14.0f)
            }
        }
        .build()
        return _emptywallet!!
    }

private var _emptywallet: ImageVector? = null
