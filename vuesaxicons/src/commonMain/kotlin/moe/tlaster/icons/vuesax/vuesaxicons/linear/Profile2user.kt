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

public val LinearGroup.Profile2user: ImageVector
    get() {
        if (_profile2user != null) {
            return _profile2user!!
        }
        _profile2user = Builder(name = "Profile2user", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.1601f, 10.87f)
                curveTo(9.0601f, 10.86f, 8.9401f, 10.86f, 8.8301f, 10.87f)
                curveTo(6.4501f, 10.79f, 4.5601f, 8.84f, 4.5601f, 6.44f)
                curveTo(4.5601f, 3.99f, 6.5401f, 2.0f, 9.0001f, 2.0f)
                curveTo(11.4501f, 2.0f, 13.4401f, 3.99f, 13.4401f, 6.44f)
                curveTo(13.4301f, 8.84f, 11.5401f, 10.79f, 9.1601f, 10.87f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.41f, 4.0f)
                curveTo(18.35f, 4.0f, 19.91f, 5.57f, 19.91f, 7.5f)
                curveTo(19.91f, 9.39f, 18.41f, 10.93f, 16.54f, 11.0f)
                curveTo(16.46f, 10.99f, 16.37f, 10.99f, 16.28f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.16f, 14.56f)
                curveTo(1.74f, 16.18f, 1.74f, 18.82f, 4.16f, 20.43f)
                curveTo(6.91f, 22.27f, 11.42f, 22.27f, 14.17f, 20.43f)
                curveTo(16.59f, 18.81f, 16.59f, 16.17f, 14.17f, 14.56f)
                curveTo(11.43f, 12.73f, 6.92f, 12.73f, 4.16f, 14.56f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.3401f, 20.0f)
                curveTo(19.0601f, 19.85f, 19.7401f, 19.56f, 20.3001f, 19.13f)
                curveTo(21.8601f, 17.96f, 21.8601f, 16.03f, 20.3001f, 14.86f)
                curveTo(19.7501f, 14.44f, 19.0801f, 14.16f, 18.3701f, 14.0f)
            }
        }
        .build()
        return _profile2user!!
    }

private var _profile2user: ImageVector? = null
