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

public val LinearGroup.`User-square`: ImageVector
    get() {
        if (`_user-square` != null) {
            return `_user-square`!!
        }
        `_user-square` = Builder(name = "User-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.14f, 21.62f)
                curveTo(17.26f, 21.88f, 16.22f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(7.78f, 22.0f, 6.74f, 21.88f, 5.86f, 21.62f)
                curveTo(6.08f, 19.02f, 8.75f, 16.97f, 12.0f, 16.97f)
                curveTo(15.25f, 16.97f, 17.92f, 19.02f, 18.14f, 21.62f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 18.78f, 3.14f, 20.85f, 5.86f, 21.62f)
                curveTo(6.08f, 19.02f, 8.75f, 16.97f, 12.0f, 16.97f)
                curveTo(15.25f, 16.97f, 17.92f, 19.02f, 18.14f, 21.62f)
                curveTo(20.86f, 20.85f, 22.0f, 18.78f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                close()
                moveTo(12.0f, 14.17f)
                curveTo(10.02f, 14.17f, 8.42f, 12.56f, 8.42f, 10.58f)
                curveTo(8.42f, 8.6f, 10.02f, 7.0f, 12.0f, 7.0f)
                curveTo(13.98f, 7.0f, 15.58f, 8.6f, 15.58f, 10.58f)
                curveTo(15.58f, 12.56f, 13.98f, 14.17f, 12.0f, 14.17f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.58f, 10.58f)
                curveTo(15.58f, 12.56f, 13.98f, 14.17f, 12.0f, 14.17f)
                curveTo(10.02f, 14.17f, 8.42f, 12.56f, 8.42f, 10.58f)
                curveTo(8.42f, 8.6f, 10.02f, 7.0f, 12.0f, 7.0f)
                curveTo(13.98f, 7.0f, 15.58f, 8.6f, 15.58f, 10.58f)
                close()
            }
        }
        .build()
        return `_user-square`!!
    }

private var `_user-square`: ImageVector? = null
